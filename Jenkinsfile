#!/usr/bin/env groovy
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
                def reg = ''
                sh """
                

                grep -m 1 "Creating CI Applications/*" test.log | grep -oP 'Applications/[^/]+/[^/]+' >${reg}
                

                """
                 // Déclarer une variable avec def
                    
                    
                    // Utiliser la variable déclarée
                    echo "La valeur de ma variable est : ${reg}"
                 /*sh 'mvn org.cyclonedx:cyclonedx-maven-plugin:makeBom'
                 sh'cat target/CycloneDX-Sbom.xml'*/
                
            }
        }
       
    }
  }

