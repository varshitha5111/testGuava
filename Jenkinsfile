pipeline{
	agent any
	
	tools{
		maven 'Maven'
	}
	
	stages{
		stage('Checkout'){
			steps{
				git branch:'master',url:'https://github.com/varshitha5111/testGuava.git'
			}
		}
		stage('Build'){
			steps{
				sh 'mvn clean package'
			}
		}
		stage('Test'){
			steps{
				sh 'mvn test'
			}
		}
		stage('Run Application'){
			steps{
				sh 'java -jar target/MyGauva-1.0-SNAPSHOT.jar'
			}
		}
	}
	post{
		success{
			echo 'success'
		}
		failure{
			echo 'fail'
		}
	}
}
