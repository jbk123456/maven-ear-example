pipeline {
    
  agent any
  stages {
    stage('clone') {
      steps {
          echo 'hello'
          checkout scm

      }
    }
    stage('install') {
      steps {
          echo 'hi'
          sh'pwd'
          sh'ls -l'
          sh'java -version'
          echo 'hamdi'
          sh 'mvn clean install -Dmaven.test.skip=true'
          

      }
    }
   stage('generate SBOM') {
            steps {
                sh'ls -lr module-ejb/target/'
                sh'ls -lr module-web/target/'
                sh'ls -lr module-ear/target/'
                sh """
                grep "Creating CI Applications/*" test.log| grep -oP 'Applications/[^/*/]+'

                """
                 /*sh 'mvn org.cyclonedx:cyclonedx-maven-plugin:makeBom'
                 sh'cat target/CycloneDX-Sbom.xml'*/
                
            }
        }
       
    }
  }

