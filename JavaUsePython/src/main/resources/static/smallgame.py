# -*- coding: utf-8 -*-

import random
import sys

# 设置输出编码为UTF-8
sys.stdout.reconfigure(encoding='utf-8')

def guess_number(n):
    if n == 42:
        print("恭喜你，你猜对了！")
        return 1
    else:
        print("很遗憾，你猜错了。")
        return 0

if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Usage: python your_script.py <number>")
        sys.exit(1)

    number = int(sys.argv[1])
    result = guess_number(number)
    print(result)
