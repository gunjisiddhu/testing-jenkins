pipeline {
    agent any

    stages {
       stage('SonarQube Analysis') {
                     steps {
                         script {
                                       def scannerHome = tool name: 'SonarQube Scanner', type: 'hudson.plugins.sonar.SonarRunnerInstallation'
                                       withSonarQubeEnv('SonarQube') {
                                           sh "${scannerHome}/bin/sonar-scanner"
                                       }
                                   }
                     }
                 }
    }
}
