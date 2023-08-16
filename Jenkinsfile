pipeline {
    agent any

    stages {
        stage('Build and SonarQube Analysis') {
            steps {
                script {

                    def sonarScannerHome = tool name: 'SonarQube', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
                    def sonarScannerCmd = "${sonarScannerHome}\\bin\\sonar-scanner.bat"

                        withSonarQubeEnv('SonarQube') {


                             def sonarScannerCmd = "${scannerHome}\\bin\\sonar-scanner.bat"
                                                     bat "${sonarScannerCmd} -Dsonar.projectKey=sqp_d30696a6fd179a3763b6e1276d82b7cca9d91736" +
                                                         " -Dsonar.java.binaries=target/classes"
                        }

                }
            }
        }
    }
}






