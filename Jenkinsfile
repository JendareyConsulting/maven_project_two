pipeline {
    agent any
    tools{
        maven 'maven 3.9.3'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/JendareyConsulting/devops-automation.git']])
                sh 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t jendaredocker/devops-integration .'
                }
            }
        }
    }
}

