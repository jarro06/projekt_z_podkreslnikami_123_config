 
listView('projekt_z_podkreslnikami_123 Jobs') {
    description('projekt_z_podkreslnikami_123 Jobs')
    jobs {
        regex('projekt_z_podkreslnikami_123_.+')
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
