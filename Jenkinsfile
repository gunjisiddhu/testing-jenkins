pipeline {
    agent any

    stages {
        stage('SonarQube Analysis') {
                   steps {
                       script {
                           def scannerHome = tool name: 'SonarQube', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
                           def sonarScannerCmd = "${scannerHome}\\bin\\sonar-scanner.bat"

                           withSonarQubeEnv('SonarQube') {
                               bat "${sonarScannerCmd}"
                           }
                       }
                   }
               }
    }
}
