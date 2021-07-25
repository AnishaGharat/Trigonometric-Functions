pipeline {

	agent any
	
	
	stages {
		stage('Build') {
			steps{
				git 'https://github.com/AnishaGharat/Trigonometric-Functions.git'
				sh './mvnw clean compile'
		
			}
		}
		stage('Test') {
			steps{
				sh './mvnw test'
			}
		
		}
		
		post {
			always {
			
				junit '**/Test_Reports/*.xml'
			}
		
		
		}
	
	}

}