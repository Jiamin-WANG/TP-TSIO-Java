<?php
function conversion($v, $u1, $u2) {
  if ($u1 == "K") 
    return (($u2 == "C") ? $v-273.15 : ($v*(9/5))-459.67);
  if ($u1 == "C") 
    return (($u2 == "F") ? ($v*(9/5)) + 32 : ($v+273.15));
  if ($u1 == "F") 
    return (($u2 == "K") ? ($v+459.67)*(5/9) : (($v-32)*(5/9)));
}

$value = $_POST["value"];//ֵ
$unit = $_POST["unit"];//
if ($unit == "F") {
  $unit1 = "C";//the 2 units to tranfer
  $unit2 = "K";
} elseif ($unit == "C") {
  $unit1 = "F";
  $unit2 = "K";
} else {
  $unit1 = "F";
  $unit2 = "C";
}
header ("Content-type: text/json");

echo '{';
echo '  "temperature" : {';
echo '          "value" : "'.$value.'", "unit" : "'.$unit.'"';// input the value and unit 
echo '  },';
echo '  "conversions" : [';
echo '    { "value" : "'.conversion($value, $unit, $unit1).'", "unit" : "'.$unit1.'" },'; //the other two temperatures to transfer: value & unit
echo '    { "value" : "'.conversion($value, $unit, $unit2).'", "unit" : "'.$unit2.'" }';
echo '  ]';
echo '}';
?>