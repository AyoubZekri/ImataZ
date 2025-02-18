package com.example.imatah.repository

import com.example.imatah.model.Report
import java.util.Date

object ReportRepository {
    fun getReports(): List<Report> {
        return listOf(
            Report(
                id = 1,
                name = "Report 1",
                description = "This is the first report",
                status = "Pending",
                category = "General",
                imageUrl = "https://picsum.photos/id/237/600/400",
                coordinates = Pair(36.8065, 10.1815),
                createdAt = Date(),
                updatedAt = Date()
            ),
            Report(
                id = 2,
                name = "Report 2",
                description = "This is the second report",
                status = "Completed",
                category = "Urgent",
                imageUrl = "https://picsum.photos/id/237/600/400",
                coordinates = Pair(36.8065, 10.1815),
                createdAt = Date(),
                updatedAt = Date()
            ),
            Report(
                id = 3,
                name = "Report 3",
                description = "This is the third report",
                status = "In Progress",
                category = "Maintenance",
                imageUrl = "https://picsum.photos/id/237/600/400",
                coordinates = Pair(36.8065, 10.1815),
                createdAt = Date(),
                updatedAt = Date()
            ),
            Report(
                id = 4,
                name = "Report 4",
                description = "This is the fourth report",
                status = "Pending",
                category = "General",
                imageUrl = "https://picsum.photos/id/240/600/400",
                coordinates = Pair(36.8065, 10.1815),
                createdAt = Date(),
                updatedAt = Date()
            ),
            Report(
                id = 5,
                name = "Report 5",
                description = "This is the fifth report",
                status = "Completed",
                category = "Urgent",
                imageUrl = "https://picsum.photos/id/241/600/400",
                coordinates = Pair(36.8065, 10.1815),
                createdAt = Date(),
                updatedAt = Date()
            )
        )
    }
}
