(function(){
  function install(){
    if (!window.jsf || !jsf.ajax) return;
    try {
      jsf.ajax.addOnError(function(data){
        var code = (data && (data.responseCode||0))|0;
        var status = data && data.status;
        var err  = data && (data.errorName || data.name) || '';
        if (status==='emptyResponse' || err==='serverError' || err==='httpError' || code===401 || code===0) {
          try { window.location.assign(window.location.href); } catch(e){ window.location.reload(true); }
        }
      });
    } catch(e) { /* no-op */ }
  }
  if (document.readyState==='complete' || document.readyState==='interactive') install();
  else document.addEventListener('DOMContentLoaded', install);
})();
