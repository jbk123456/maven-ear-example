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
                regex="[^/]+" # Votre expression régulière variable ici

                grep "Creating CI Applications/test/blabla/archive" fichier.txt | grep -oP "Applications/${regex}"

                """
                 /*sh 'mvn org.cyclonedx:cyclonedx-maven-plugin:makeBom'
                 sh'cat target/CycloneDX-Sbom.xml'*/
                
            }
        }
       
    }
  }

