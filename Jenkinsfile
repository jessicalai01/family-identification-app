pipeline {
    agent any
    options {
        timeout(time: 3, unit: 'SECONDS')
    }
    stages {
        stage('Checkout') {
        steps {
            echo 'Hello, World'
            sh 'gradle -version'
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'
                sh './gradlew clean build'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying...'
                sh 'java -version'
            }
        }
    }
    post {
        always {
            echo 'I will always say Hello again!'
        }
    }
}