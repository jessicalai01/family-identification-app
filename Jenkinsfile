pipeline {
    agent any
    stages {
        stage('Checkout') {
        node {
            checkout: 'https://github.com/jessicalai01/family-identification-app'
            stash: source
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
            }
        }
    }
}