pipelineJob('second') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/samydilini/second.git'
                    }
                    branch '*'
                }
            }
        }
    }
}