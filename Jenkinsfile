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
        stage('Gradle Build') {
            steps {
                sh './gradlew clean build'
                echo 'Clean Build Successful'
            }
        }
        stage('Docker Build') {
            steps {
                sh 'export PATH="$PATH:/Applications/Docker.app/Contents/Resources/bin/'
                echo 'Starting to build docker image'
                sh 'docker build . -t jessicallai1/app'
                echo 'Finished building. Starting to run docker image'
                sh 'docker run jessicallai1/app'
                echo 'Finished running. Starting to push docker image'
                sh 'docker push jessicallai1/app'

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