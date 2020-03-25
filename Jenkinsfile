node{
stage ('SCM Checkout')
{
git 'https://github.com/AnubhavDalela/JenkinPipeline
}
stage ('Compile-Package'){
def mvnHome = tool name: 'TestMaven', type: 'maven'
sh "${mvnHome}/bin/mvn package"
}

}
