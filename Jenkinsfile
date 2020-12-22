pipeline {
    agent any
    tools {
	  jdk 'jdk8' 
      maven 'Maven3' 
    }

    stages{
        stage('Compile'){
            steps{
                sh script: 'mvn clean package'
            }
        }
		}
		}

    