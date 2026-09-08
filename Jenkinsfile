pipeline {

    agent any
    // GitHub webhook test
    triggers {
        githubPush()
    }
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
                // Publish TestNG results
                step([
                        $class               : 'Publisher',
                        reportFilenamePattern: 'target/surefire-reports/testng-results.xml'
                ])
                // Publish Extent Report
                publishHTML([
                        allowMissing         : true,
                        alwaysLinkToLastBuild: true,
                        keepAll              : true,
                        reportDir            : 'test-output',
                        reportFiles          : 'ExtentReport.html',
                        reportName           : 'Extent Report'
                ])
            }

            success {
                echo 'Automation tests passed'
            }

            failure {
                echo 'Automation tests failed'
            }
        }
    }