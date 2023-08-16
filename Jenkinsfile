pipeline {
    agent any

    stages {
        stage('Sonar'){
            steps{

                bat "mvn clean verify sonar:sonar -Dsonar.projectKey=Github_project -Dsonar.projectName='Github_project' -Dsonar.host.url=http://localhost:9000 -Dsonar.token=squ_96120e225fe0f60473f88d2db60a188028c04648"
            }

        }
    }
}
