
withConfig(configuration) {
    inline(phase: 'CONVERSION') { source, context, classNode ->
        classNode.putNodeMetaData('projectVersion', '0.1')
        classNode.putNodeMetaData('projectName', 'MainApp/plugins/core')
        classNode.putNodeMetaData('isPlugin', 'true')
    }
}
