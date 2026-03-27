// Domain models for Meditracker App

package com.meditracker.domain.model

// Model class for representing a medicine
data class Medicine(
    val id: String,
    val name: String,
    val dosage: String,
    val sideEffects: List<SideEffect> = listOf()
)

// Model class for representing a medicine reminder
data class MedicineReminder(
    val id: String,
    val medicineId: String,
    val reminderTime: String,
    val notes: String? = null
)

// Model class for representing a daily log
data class DailyLog(
    val id: String,
    val date: String,
    val adherenceStats: AdherenceStats,
    val items: List<DailyLogItem>
)

// Model class for representing an item in the daily log
data class DailyLogItem(
    val medicineReminderId: String,
    val taken: Boolean,
    val notes: String? = null
)

// Model class for representing a side effect
data class SideEffect(
    val id: String,
    val name: String,
    val severity: SideEffectSeverity
)

// Enum class for representing the severity of side effects
enum class SideEffectSeverity {
    MILD,
    MODERATE,
    SEVERE
}

// Model class for representing adherence statistics
data class AdherenceStats(
    val totalDoses: Int,
    val dosesTaken: Int,
    val adherencePercentage: Double
)