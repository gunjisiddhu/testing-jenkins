pipeline {
    agent any

    stages {
       stage('SonarQube Analysis') {
                     steps {
                         script {
                             def scannerHome = tool name: 'local-sonar-server', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
                             withSonarQubeEnv('local-sonar-server') {
                                 sh "${scannerHome}/bin/sonar-scanner"
                             }
                         }
                     }
                 }
    }
}
