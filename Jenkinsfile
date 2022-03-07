pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'cd /producto-service'
                sh 'chmod +x gradlew && ./gradlew build'
                sh "docker build -t service-config:0.0.${BUILD_NUMBER} ."
                sh 'docker images'
                sh "docker tag service-config:0.0.${BUILD_NUMBER} camilolagos/service-config:0.0.${BUILD_NUMBER}"
                withCredentials([usernamePassword(credentialsId: 'dockercredentials', passwordVariable: 'PASSWORD_DOCKER', usernameVariable: 'USERNAME_DOCKER')]) {
                    sh "docker login -u $USERNAME_DOCKER -p $PASSWORD_DOCKER"
                    sh "docker push camilolagos/service-config:0.0.${BUILD_NUMBER}"
                }
            }
        }
    }
}
