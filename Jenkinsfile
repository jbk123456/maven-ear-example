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
                
                //tring modules =sh(script: '''grep -oP "<module>\\K.*?(?=</module>)" pom.xml''', returnStdout: true)
                
                //modules= $(grep -oP "<module>\\K.*?(?=</module>)" pom.xml)
                sh '''
                grep -oP "<module>\\K.*?(?=</module>)" pom.xml
                modules=$(grep -oP "<module>\\K.*?(?=</module>)" pom.xml)
                echo " ${modules} "
                for module in $modules; do
                  echo "hamdi ${module} "
                  
                done
               
                touch listing.txt
                cat test.log | tee -a listing.txt
                

                grep -m 1 "Creating CI Applications/*" listing.txt | grep -oP 'Applications/[^/]+/[^/]+' 
                

                '''
                 // Déclarer une variable avec def
                    
                    
                    // Utiliser la variable déclarée
                    
                 /*sh 'mvn org.cyclonedx:cyclonedx-maven-plugin:makeBom'
                 sh'cat target/CycloneDX-Sbom.xml'*/
                
            }
        }
       
    }
  }

