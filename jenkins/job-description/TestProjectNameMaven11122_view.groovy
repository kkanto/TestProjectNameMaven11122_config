 
listView('TestProjectNameMaven11122 Jobs') {
    description('TestProjectNameMaven11122 Jobs')
    jobs {
        regex('TestProjectNameMaven11122_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
