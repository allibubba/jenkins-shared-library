def call(Map config=[:], Closure body) {
    node {

        stage("Install") {
            echo "npm install"
        }

        stage("Test") {
            echo "npm test"
        }

        stage("Deploy") {
            if (config.deploy) {
                sh "npm publish"
            }
        }

        body()
    }
}
