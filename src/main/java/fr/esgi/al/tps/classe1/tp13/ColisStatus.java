package fr.esgi.al.tps.classe1.tp13;

//VO
enum ColisStatus {
    IN_PREPARATION, DELIVERED, CANCELED;

    public boolean isCancelled() {
        return this == CANCELED;
    }
}
