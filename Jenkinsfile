pipeline {

	agent any
	
	
	stages {
		stage('Build') {
			steps{
				git 'https://github.com/AnishaGharat/Trigonometric-Functions.git'
				sh './mvn clean compile'
		
			}
		}
		stage('Test') {
			steps{
				sh './mvn test'
			}
		
		}
		
	
	}

}