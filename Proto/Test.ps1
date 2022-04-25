function test([string]$testfile, [string]$expectedfile) {
    $expResult = cat $expectedfile
	$path = "./tests/" + $testfile

    $input = cat $path
    $output = echo $input | java -cp .\src\class\ Main

  if ($output -eq $null -and $expResult -eq $null){
      Write-Host "Test file: $testfile passed." -ForegroundColor Green
	  Write-Host ""
     }
  else{

    $diff = compare $output $expResult

    if ($diff.Length -eq 0) {
        Write-Host "Test file: $testfile passed." -ForegroundColor Green
	Write-Host ""
    } else {
        Write-Host "Test file: $testfile failed." -ForegroundColor Red
        Write-Host "Expected:" -ForegroundColor Red -BackgroundColor Yellow
        Write-Host "-------------------------------------"
        Write-Host $expResult
        Write-Host "Actual:" -ForegroundColor Red -BackgroundColor Yellow
        Write-Host "-------------------------------------"
        Write-Host $output
	Write-Host ""
    }

 }
}

function testAll() {

    $tfiles = dir .\tests -fi "*_input.txt" -Name

    foreach ($item in $tfiles) {
        $temp = ".\tests\" + $item.Substring(0, $item.LastIndexOf('_'))
	$temp2 = $temp + "_output.txt"

        test $item $temp2
    }
}

#main

if ($args.Count -eq 0) {
    testAll
} elseif($args.Count -eq 2) {
    test $args[0] $args[1]
} else {
    Write-Host "Wrong arguments!"
}

Write-Host ""
read-host Press ENTER to exit...
