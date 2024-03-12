pipeline {
    agent any
    
    stages {
        stage('Clone Repository') {
            steps {
                git git branch: 'main', credentialsId: 'gittoken', url: 'https://github.com/muhammadaliraza14/mlops-cs.git'
            }
        }
        stage('Install Dependencies') {
            steps {
                sh 'pip install -r requirements.txt'
            }
        }
        stage('Execute test.py') {
            steps {
                sh 'python test.py'
            }
        }
        stage('Deploy') {
            steps {
                script {
                    def branchName = env.BRANCH_NAME
                    if (branchName == 'main') {
                        echo "Deploying to production"
                    } else {
                        echo "Deploying to UAT"
                    }
                }
            }
        }
    }
}
