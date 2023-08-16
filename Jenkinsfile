pipeline {
    agent any

    stages {
        stage('Build and SonarQube Analysis') {
            steps {
                  bat "mvn clean verify sonar:sonar -Dsonar.projectKey=Pipeline-Test  -Dsonar.projectName='Pipeline-Test' -Dsonar.host.url=http://localhost:9000 -Dsonar.token=sqp_d30696a6fd179a3763b6e1276d82b7cca9d91736"
            }
        }
    }
}






