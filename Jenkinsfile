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
                bat 'javac Main.java'
            }
        }

        stage('Package') {
            steps {
                bat 'jar cfe Main.jar Main Main.class'
            }
        }

        stage('Run') {
            steps {
                bat 'java -jar Main.jar'
            }
        }

        stage('Copy Artifact') {
            steps {
                bat 'copy Main.jar C:\\DevOpsArtifacts\\Demo-Java\\Main.jar /Y'
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'Main.jar', fingerprint: true
        }
    }
}