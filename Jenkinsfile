node{
stage ('SCM Checkout'){
git 'https://github.com/AnubhavDalela/JenkinPipeline'
}
stage ('Compile-Package'){
def mvnHome = tool name: 'TestMaven', type: 'maven'
bat "${mvnHome}/bin/mvn package"
     }
 stage('Slack Notification'){
     slackSend baseUrl: 'https://hooks.slack.com/services/', channel: '#jenkins-pipeline-demo', color: 'good', message: 'Welcome to jenkins', tokenCredentialId: 'demo', username: 'Globallogic'
     }
}
