#region --- Au3Recorder generated code Start (v3.3.9.5 KeyboardLayout=00004009)  ---

#region --- Internal functions Au3Recorder Start ---
Func _Au3RecordSetup()
Opt('WinWaitDelay',100)
Opt('WinDetectHiddenText',1)
Opt('MouseCoordMode',0)
Local $aResult = DllCall('User32.dll', 'int', 'GetKeyboardLayoutNameW', 'wstr', '')
If $aResult[1] <> '00004009' Then
  MsgBox(64, 'Warning', 'Recording has been done under a different Keyboard layout' & @CRLF & '(00004009->' & $aResult[1] & ')')
EndIf

EndFunc

Func _WinWaitActivate($title,$text,$timeout=0)
	WinWait($title,$text,$timeout)
	If Not WinActive($title,$text) Then WinActivate($title,$text)
	WinWaitActive($title,$text,$timeout)
EndFunc

_AU3RecordSetup()
#endregion --- Internal functions Au3Recorder End ---
#comments-start
_WinWaitActivate("Focus-Purchase Voucher VAT - Google Chrome","")
#comments-end
MouseClick("left",1108,607,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(627,604)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseMove(658,617)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(641,519)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",758,614,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(748,518)
Sleep(2000)
MouseUp("left")
#comments-start
#endregion --- Au3Recorder generated code End ---
#comments-end
