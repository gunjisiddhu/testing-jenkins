pipeline {
    agent any

    stages {
        stage('Build and SonarQube Analysis') {
            steps {
                  bat "mvn clean verify sonar:sonar -Dsonar.projectKey=calc-testing   -Dsonar.projectName='calc-testing'  -Dsonar.host.url=http://localhost:9000 -Dsonar.token=sqp_bde7ac1ad88d3f9da36d9424d935acf1d7f001a6"
            }
        }
    }
}






