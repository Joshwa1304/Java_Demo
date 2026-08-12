pipeline {
    agent any

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'javac OddorEven.java'
            }
        }

        stage('Package') {
            steps {
                bat 'jar cfe OddorEven.jar OddorEven OddorEven.class'
            }
        }

        stage('Run') {
            steps {
                bat 'java -jar OddorEven.jar'
            }
        }

        stage('Copy Artifact') {
            steps {
                bat 'copy OddorEven.jar C:\\DevOpsArtifacts\\Demo-Java\\OddorEven.jar /Y'
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'OddorEven.jar', fingerprint: true
        }
    }
}