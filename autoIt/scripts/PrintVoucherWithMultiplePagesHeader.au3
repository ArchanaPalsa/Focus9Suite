

Func _WinWaitActivate($title,$text,$timeout=0)
	WinWait($title,$text,$timeout)
	If Not WinActive($title,$text) Then WinActivate($title,$text)
	WinWaitActive($title,$text,$timeout)
EndFunc

_WinWaitActivate("Focus-Purchase Voucher VAT - Google Chrome","")
MouseClick("left",1101,289,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(346,420)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",1054,200,1)
Sleep(2000)
MouseClick("left",1048,280,1)
Sleep(2000)
MouseClick("left",556,663,1)
Sleep(2000)


