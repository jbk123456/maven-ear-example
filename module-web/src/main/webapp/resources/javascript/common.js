// General JavaScript functions for the web application

/**
 * Initialize application
 */
function initApp() {
    console.log('Application initialized');
}

/**
 * Show message to user
 */
function showMessage(message, type) {
    console.log(type + ': ' + message);
}

/**
 * Validate form input
 */
function validateForm(formId) {
    var form = document.getElementById(formId);
    if (form) {
        return form.checkValidity();
    }
    return false;
}

// Initialize on page load
if (document.readyState === 'loading') {
    document.addEventListener('DOMContentLoaded', initApp);
} else {
    initApp();
}
