pipeline {
    agent any
    options {
        timeout(time: 10, unit: 'MINUTES')
    }
    stages {
        stage('Checkout') {
        steps {
            echo 'Checking out'
            checkout scm
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'
                sh './gradlew clean build'
                echo 'Clean Build Successful'
            }
        }

        stage('Test') {
            steps {
                echo 'Testing...'
                sh './gradlew test'

            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
    post {
        always {
            echo 'I will always say Hello again!'
        }
    }
}