package com.joedev.curso.settings

data class SettingsModel(
    var volume: Int,
    var bluetooth: Boolean,
    var darkMode: Boolean,
    var vibration: Boolean
)