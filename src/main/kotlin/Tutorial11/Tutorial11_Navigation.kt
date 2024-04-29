package Tutorial11

//enlace = https://developer.android.com/develop/ui/compose/navigation?hl=es-419

//Vinculos directos
/*

Navigation Compose admite vínculos directos implícitos que también se pueden definir como parte de la función composable().
Su parámetro deepLinks acepta una lista de objetos NavDeepLink que se pueden crear rápidamente con el método navDeepLink():

    val uri = "https://www.example.com"

    composable(
    "profile?id={id}",
    deepLinks = listOf(navDeepLink { uriPattern = "$uri/{id}" })
    ) { backStackEntry ->
        Profile(navController, backStackEntry.arguments?.getString("id"))
    }
 */

/*

"Esos vínculos directos te permiten asociar una URL, acción o tipo de MIME específico con un elemento componible.
De forma predeterminada, esos vínculos directos no se exponen a aplicaciones externas.
Para que estos vínculos directos estén disponibles externamente, debes agregar los elementos <intent-filter> apropiados al archivo manifest.xml de tu app.
Para habilitar el vínculo directo en el ejemplo anterior, debes agregar lo siguiente dentro del elemento <activity> del manifiesto:"


Debemos meter esto en el ejemplo anterior pero no se muy bien donde
<activity …>
<intent-filter>
...
<data android:scheme="https" android:host="www.example.com" />
</intent-filter>
</activity>

 */