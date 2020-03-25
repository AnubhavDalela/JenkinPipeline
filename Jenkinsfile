node{
stage ('SCM Checkout'){
git 'https://github.com/AnubhavDalela/JenkinPipeline'
}
stage ('Compile-Package'){
def mvnHome = tool name: 'TestMaven', type: 'maven'
bat "${mvnHome}/bin/mvn package"
     }
     stage ('Email Notification'){
     mail bcc: '', body: '', cc: 'anubhav.dalela@gmail.com', from: '', replyTo: '', subject: 'Execution result', to: 'anubhav.kdalela@gmail.com'
     }    
}
