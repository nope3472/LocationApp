package eu.tutorials.locationapp

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LocationViewModel: ViewModel() {
    private val location= mutableStateOf<LocationData?>(null)
    val loc : State<LocationData?> = location

    fun updatelocation(newlocation:LocationData){
        location.value=newlocation
    }
}