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
MouseClick("left",460,295,1)
Sleep(2000)
MouseClick("left",466,314,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(665,332)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",476,299,1)
Sleep(2000)
MouseClick("left",463,317,1)
Sleep(2000)
MouseClick("left",463,331,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(724,341)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",462,316,1)
Sleep(2000)
MouseClick("left",455,333,1)
Sleep(2000)
MouseClick("left",463,352,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(743,366)
Sleep(2000)
MouseUp("left")
Sleep(2000)
MouseClick("left",458,336,1)
Sleep(2000)
MouseClick("left",454,352,1)
Sleep(2000)
MouseClick("left",464,422,1)
Sleep(2000)
MouseDown("left")
Sleep(2000)
MouseMove(751,413)
Sleep(2000)
MouseUp("left")
#comments-start
#endregion --- Au3Recorder generated code End ---
#comments-end
