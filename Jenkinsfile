pipeline {
    agent any

    stages {
        stage('Build and SonarQube Analysis') {
            steps {
                script {

                    def sonarScannerHome = tool name: 'SonarQube', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
                    def sonarScannerCmd = "${sonarScannerHome}\\bin\\sonar-scanner.bat"

                        withSonarQubeEnv('SonarQube') {
                            bat "${sonarScannerCmd}"
                        }

                }
            }
        }
    }
}






