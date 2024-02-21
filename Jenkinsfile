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
   stage('xld step') {
            steps {

                
                sh '''
                grep '\\.ear"$' applications.yaml
                grep '\\.ear"$' applications.yaml | sed 's/.*\\/\\([^/]*\\)\\.ear".*/\\1/'
                '''
                sh '''
                mkdir target
                grep -oP "<module>\\K.*?(?=</module>)" pom.xml
                modules=$(grep -oP "<module>\\K.*?(?=</module>)" pom.xml)
                echo " ${modules}"
                for module in $modules; do
                  echo "hamdi ${module} "
                  find ${module}/target -type f -name "${module}*.ear"
                  find ${module}/target -type f -name "${module}*.war"
                  
                done
               
                

                '''
                 sh ''' 
                 touch listing.txt
                 cat test.log | tee -a listing.txt
                

                 grep -m 1 "Creating CI Applications/*" listing.txt | grep -oP "Applications/[^/]+/[^/]+"
                
                 
                 '''
                
            }
        }
       
    }
  }

