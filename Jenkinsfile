pipeline {

    agent any

    stages {

     
        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Automation Tests') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        always {
            echo 'Automation execution completed'
        }

        success {
            echo 'Automation tests passed'
        }

        failure {
            echo 'Automation tests failed'
        }
    }
}