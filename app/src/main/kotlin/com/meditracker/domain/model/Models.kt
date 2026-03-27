package com.meditracker.domain.model

data class Medicine(
    val id: String,
    val name: String,
    val dosage: String,
    val frequency: String
)

data class MedicineReminder(
    val id: String,
    val medicineId: String,
    val reminderTime: String,
    val isActive: Boolean
)

data class DailyLog(
    val id: String,
    val logDate: String,
    val adherenceStats: AdherenceStats,
    val items: List<DailyLogItem>
)

data class DailyLogItem(
    val medicineId: String,
    val taken: Boolean
)

data class SideEffect(
    val id: String,
    val name: String,
    val severity: SideEffectSeverity
)

enum class SideEffectSeverity {
    MILD,
    MODERATE,
    SEVERE
}

data class AdherenceStats(
    val medicineId: String,
    val logId: String,
    val adhered: Boolean,
    val date: String
)
