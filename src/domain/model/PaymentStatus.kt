package domain.model

sealed interface PaymentStatus {
    object Pending : PaymentStatus
    object Completed : PaymentStatus
    object Failed : PaymentStatus
}

fun handleStatus(status: PaymentStatus) = when (status) {
    is PaymentStatus.Pending -> println("Payment is pending.")
    is PaymentStatus.Completed -> println("Payment completed successfully.")
    is PaymentStatus.Failed -> println("Payment failed.")
}

fun main() {
    val status: PaymentStatus = PaymentStatus.Completed
    handleStatus(status)
}