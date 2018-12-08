pipeline {
    agent any

    stages {
        stage("Testing") {
            steps {
                sh './gradlew test'
            }
            post {
                always {
                    junit '**/*TEST*.xml'
                }
            }
        }
    }
}
