#!/usr/bin/perl

use strict;
use warnings;

open(IN, "invites.csv") or die("file open error!");
open(IN2, "quotes.csv") or die("file open error!");
open(IN3, "categories.csv") or die("file open error!");
open(IN4, "locations.csv") or die("file open error!");
open(IN5, "requests.csv") or die("file open error!");
open(OUT, ">output_invite_quote.csv");

my @array;
my %kwhash;
my %category;
my %location;
my @request;
my $quote = 0;
my $output;
my $n = 0;

while(<IN2>){
  chomp;

  @array = split;

  if($n != 0){
    $kwhash{$array[1]} = 1;
  }

  $n++;
}

$n = 0;

while(<IN3>){
  chomp;

  @array = split;

  if($n != 0){
    $category{$array[0]} = $array[1];
}

  $n++;
}

$n = 0;

while(<IN4>){
  chomp;

  @array = split;

  if($n !=  0){
    $location{$array[0]} = $array[1];
  }

  $n++;
}

$n = 0;

while(<IN5>){

  chomp;

  @array = split;

  if($n != 0){
    $request[$array[0]]->{'category_id'} = $array[2];
    $request[$array[0]]->{'category'} = $category{$array[2]};
    $request[$array[0]]->{'location_id'} = $array[3];
    $request[$array[0]]->{'location'} = $location{$array[3]};
  }

  $n++;
}

$n = 0;


while(<IN>){

  chomp;

  @array = split;

  if($n != 0 ){
    $quote = 0;
    if(exists $kwhash{$array[0]}){
      $quote = 1;
    }
    $output = $_;
    $output =~ s/\r//g;
    print OUT "$output\t$quote\t$request[$array[1]]{'category_id'}\t$request[$array[1]]{'category'}\t$request[$array[1]]{'location_id'}\t$request[$array[1]]{'location'}\n";
    }else{
    $output = $_;
    $output =~ s/\r//g;
    print OUT "$output\tquote\tcategory_id\tcategory\tlocation_id\tlocation\n";
    }
    $n++;
 }

close IN5;
close IN4;
close IN3;
close IN2;
close IN;
close OUT;

