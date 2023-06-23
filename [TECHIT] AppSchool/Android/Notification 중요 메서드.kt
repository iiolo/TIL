// Notification Channel을 등록하는 메서드
    // 첫 번째 : 코드에서 채널을 관리하기 위한 이름
    // 두 번째 : 사용자에게 노출 시킬 이름
    fun addNotificationChannel(id:String, name:String){
        // 안드로이드 8.0 이상일 때만 동작하게 한다.
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            // 알림 메시지를 관리하는 객체를 추출한다.
            val notificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            // id를 통해 NotificationChannel 객체를 추출한다.
            // 채널이 등록된 적이 없다면 null을 반환한다.
            val channel = notificationManager.getNotificationChannel(id)
            // 채널이 등록된 적이 없다면...
            if(channel == null){
                // 채널 객체를 생성한다.
                val newChannel = NotificationChannel(id, name, NotificationManager.IMPORTANCE_HIGH)
                // 단말기에 LED 램프가 있다면 램프를 사용하도록 설정한다.
                newChannel.enableLights(true)
                // LED 램프의 색상을 설정한다.
                newChannel.lightColor = Color.RED
                // 진동을 사용할 것인가?
                newChannel.enableVibration(true)
                // 채널을 등록한다.
                notificationManager.createNotificationChannel(newChannel)
            }

        }
    }

    // Notification 메시지 관리 객체를 생성하는 메서드
    // Notification 채널 id를 받는다.
    fun getNotificationBuilder(id:String) : NotificationCompat.Builder{
        // 안드로이드 8.0 이상이라면
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val builder = NotificationCompat.Builder(this, id)
            return builder
        } else {
            val builder = NotificationCompat.Builder(this)
            return builder
        }
    }
