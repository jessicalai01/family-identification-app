pipeline {
    agent any
    options {
        timeout(time: 3, unit: 'SECONDS')
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
            }
        }
        stage('Docker Build') {
            steps {
                echo 'Building Docker image...'
                sh 'docker build -t my-java-app .'
            }
        }
        stage('Docker Push') {
            when {
                branch 'main'
            }
            steps {
                echo 'Pushing Docker image to registry...'
                sh 'docker push my-java-app'
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